let currentType = "length";

const units = {
    length: ["m", "cm", "ft"],
    weight: ["kg", "g", "lb"],
    temperature: ["c", "f", "k"]
};

function setType(type) {
    currentType = type;

    const from = document.getElementById("from");
    const to = document.getElementById("to");

    from.innerHTML = "";
    to.innerHTML = "";

    units[type].forEach(unit => {

        from.innerHTML += `<option value="${unit}">${unit}</option>`;

        to.innerHTML += `<option value="${unit}">${unit}</option>`;
    });
}

async function convert() {

    const value = document.getElementById("value").value;

    const from = document.getElementById("from").value;

    const to = document.getElementById("to").value;

    const response = await fetch(
        `/convert/${currentType}?value=${value}&from=${from}&to=${to}`
    );

    const data = await response.text();

    document.getElementById("result").innerText = data;
}


function resetFields() {

    document.getElementById("value").value = "";

    document.getElementById("result").innerText = "";

    document.getElementById("from").selectedIndex = 0;

    document.getElementById("to").selectedIndex = 0;
}

window.onload = () => {
    setType("length");
};


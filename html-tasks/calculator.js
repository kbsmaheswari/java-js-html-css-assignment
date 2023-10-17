let displayValue = '';

function clearDisplay() {
    displayValue = '';
    updateDisplay();
}

function appendToDisplay(val) {
    displayValue += val;
    updateDisplay();
}

function calculateResult() {
    try {
        displayValue = eval(displayValue);
        updateDisplay();
    } catch (error) {
        displayValue = 'Error';
        updateDisplay();
    }
}

function updateDisplay() {
    document.getElementById('display').value = displayValue;
}

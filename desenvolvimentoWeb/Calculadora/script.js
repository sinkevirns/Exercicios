    function addToDisplay(value) {
        document.getElementById('display').value += value;
    }

    function clearDisplay() {
        document.getElementById('display').value = '';
    }

    function clearLastCharacter() {
        let displayValue = document.getElementById('display').value;
        document.getElementById('display').value = displayValue.slice(0, -1);
    }

    function toggleSign() {
        let displayValue = document.getElementById('display').value;
        if (displayValue.startsWith('-')) {
            document.getElementById('display').value = displayValue.slice(1);
        } else {
            document.getElementById('display').value = '-' + displayValue;
        }
    }

    function addParentheses() {
        let displayValue = document.getElementById('display').value;
        let lastChar = displayValue.slice(-1);

        if (!isNaN(parseInt(lastChar)) || lastChar === ')') {
            document.getElementById('display').value += ')';
        } else {
            document.getElementById('display').value += '(';
        }
    }

    function calculate() {
        let expression = document.getElementById('display').value;
        let result;
        try {
            result = eval(expression);
        } catch(error) {
            result = 'Erro';
        }
        document.getElementById('display').value = result;
    }
let numbers_stack = [];
let operator_stack = [];
let number_complete = false;

function appendToDisplay(value) {
    let display = document.getElementById("display");
    // zera o display para inserção de novo número
    if (number_complete) 
        clearDisplay();
    // não permite repetição de zero a esquerda e de pontos
    if (!(display.value == '0' && value == '0') && 
       (value != '.' || display.value.indexOf('.') < 0)) {
            // não permite zero a esquerda
            if (display.value == '0' && value != '.') {
                display.value = value;
            } else {
                display.value += value;
            }
    }
}

function operator(value) {
    if (!number_complete) {
      addNumberToStack();
      while (lenghtOfOperatorStack() > 0 && !precedence(topOfOperatorStack(), value)) {
        let result = partialCalculate();
        addResultToStack(result);
      }
    } else {
      getOperatorFromStack(value);
    }
    addOperatorToStack(value);
    updateHistory();
  }

function calculate() {
    addNumberToStack();
    let result = 0;
    while (lenghtOfOperatorStack() > 0) {
      result = partialCalculate();
      addResultToStack(result);
    }
    document.getElementById("display").value = result;
    updateHistory();
  }

  function updateHistory() {
    let historyText = '';
    for (let i = 0; i < numbers_stack.length; i++) {
      historyText += numbers_stack[i];
      if (operator_stack[i]) {
        historyText += ' ' + operator_stack[i] + ' ';
      }
    }
    document.getElementById("history-text").innerText = historyText;
  }

function clearDisplay() {
    document.getElementById("display").value = "";
    number_complete = false;
}

function clearHistory()
{
    numbers_stack = [];
    operator_stack = [];
    document.getElementById("history-text").innerText = "";
}

function backspace() {
    var displayValue = document.getElementById("display").value;
    document.getElementById("display").value = displayValue.substring(
        0, displayValue.length - 1
    );
}

function addNumberToStack() {
    let number = document.getElementById("display").value;
    number_complete = true;
    numbers_stack.push(number);
}

function addResultToStack(number) {
    numbers_stack.push(number);
}

function addOperatorToStack(value) {
    operator_stack.push(value);
}

function getOperatorFromStack(value) {
    return operator_stack.pop();
}

function partialCalculate() {
    let n2 = numbers_stack.pop();
    let n1 = numbers_stack.pop();
    let op = getOperatorFromStack();
    let result = eval(n1 + op + n2);
    return result;
}

function precedence(op1, op2) {
    let operators = new Map([
        ['+', 1],
        ['-', 1],
        ['*', 2],
        ['/', 2]
    ]);
    return operators.get(op2) > operators.get(op1); 
}

function topOfOperatorStack() {
    return operator_stack[operator_stack.length-1];
}

function lenghtOfOperatorStack() {
    return operator_stack.length;
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
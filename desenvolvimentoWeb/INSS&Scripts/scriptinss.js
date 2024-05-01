const salarioBrutoInput = document.getElementById('salarioBruto');
const dependentesInput = document.getElementById('dependentes');
const calcularButton = document.getElementById('calcular');
const inssSpan = document.getElementById('inss');
const irSpan = document.getElementById('ir');
const salarioLiquidoSpan = document.getElementById('salarioLiquido');

calcularButton.addEventListener('click', () => {
  const salarioBruto = parseFloat(salarioBrutoInput.value);
  const dependentes = parseInt(dependentesInput.value);

  let inss = 0;
  let ir = 0;
  let salarioLiquido = 0;

  if (salarioBruto <= 1412.00) {
    inss = salarioBruto * 0.075;
  } else if (salarioBruto <= 2666.68) {
    inss = salarioBruto * 0.09;
  } else if (salarioBruto <= 4000.03) {
    inss = salarioBruto * 0.12;
  } else {
    inss = salarioBruto * 0.14;
  }

  if (salarioBruto <= 2259.20) {
    ir = 0;
  } else if (salarioBruto <= 2826.65) {
    ir = (salarioBruto * 0.075) - 169.44;
  } else if (salarioBruto <= 3751.05) {
    ir = (salarioBruto * 0.15) - 381.44;
  } else if (salarioBruto <= 4664.68) {
    ir = (salarioBruto * 0.225) - 662.77;
  } else {
    ir = (salarioBruto * 0.275) - 896.00;
  }

  salarioLiquido = salarioBruto - inss - ir;

  inssSpan.textContent = `${inss.toFixed(2)}`;
  irSpan.textContent = `${ir.toFixed(2)}`;
  salarioLiquidoSpan.textContent = `R$ ${salarioLiquido.toFixed(2)}`;
});
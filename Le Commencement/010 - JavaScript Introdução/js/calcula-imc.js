var titulo = document.querySelector(".titulo-header");
titulo.textContent = "Aparecida Nutricionista";

var pacientes = document.querySelectorAll(".paciente");

for (var i = 0; i < pacientes.length; i++)
{
	var paciente = pacientes[i];

	var tdPeso = paciente.querySelector(".info-peso");
	var peso = tdPeso.textContent;

	var tdAltura = paciente.querySelector(".info-altura");
	var altura = tdAltura.textContent;

	var tdIMC = paciente.querySelector(".info-imc");

	var pesoValido = validaPeso(peso);
	var alturaValida = validaAltura(altura);

	if (pesoValido && alturaValida)
	{
		var imc = calculaImc(peso, altura);
		tdIMC.textContent = imc;
	}
	else
	{
		paciente.classList.add("paciente-invalido");
		if (!pesoValido && !alturaValida)
		{
			tdIMC.textContent = "Peso e Altura Inválidos!";
		}
		else if (!pesoValido)
		{
			tdIMC.textContent = "Peso Inválido!";
		}
		else if (!alturaValida)
		{
			tdIMC.textContent = "Altura Inválida!";
		}
	}
}

function calculaImc(peso, altura)
{
	var imc = 0;
	imc = peso / (altura * altura);
	return imc.toFixed(2);
}

function validaPeso(peso)
{
	var pesoValido = true;
	if(peso <= 0  || peso > 500)
	{
		pesoValido = false;
	}
	return pesoValido;
}

function validaAltura(altura)
{
	var alturaValida = true;
	if(altura <= 0  || altura > 2.5)
	{
		alturaValida = false;
	}
	return alturaValida
}
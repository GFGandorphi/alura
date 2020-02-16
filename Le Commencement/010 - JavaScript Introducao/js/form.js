var botaoAdd = document.querySelector("#adicionar-paciente");
botaoAdd.addEventListener("click", function()
	{
		event.preventDefault();
		var form = document.querySelector("#formAdd");
		
		var paciente = obtemPacienteDoForm(form);
		var erros = validaPaciente(paciente);

		if (erros.length == 0)
		{
			addPacienteNaTabela(paciente);
			form.reset();
			var ul = document.querySelector("#mensagens-erro");
    		ul.innerHTML = ""
		}
		else
		{
			exibeMensagensDeErros(erros);
			form.reset();
			return;
		}
	}
);

function addPacienteNaTabela(paciente)
{
	var pacienteTr = montaTr(paciente);
	var tabela = document.querySelector("#tabela-pacientes");
	tabela.appendChild(pacienteTr);
}

function obtemPacienteDoForm(form)
{
	var paciente = 
	{
		nome: form.nome.value,
		altura: form.altura.value,
		peso: form.peso.value,
		gordura: form.gordura.value,
		imc: calculaImc(form.peso.value, form.altura.value)
	}
	return paciente;
}

function montaTr(paciente)
{
	var pacienteTr = document.createElement("tr");
	pacienteTr.classList.add("paciente");

	pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
	pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
	pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
	pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
	pacienteTr.appendChild(montaTd(paciente.imc, "info-imc")); 

	return pacienteTr;
}

function montaTd(dado, classe)
{
	var td = document.createElement("td");
	td.textContent = dado;
	td.classList.add(classe);
	return td;
}

function validaPaciente(paciente)
{
	var erros = [];

	var pesoValido = validaPeso(paciente.peso);
	var alturaValida = validaAltura(paciente.altura);
	var gorduraValida = validaGordura(paciente.gordura);

	if (!pesoValido || paciente.peso.length == 0) erros.push("Peso Inválido!");
	if (!alturaValida || paciente.altura.length == 0) erros.push("Altura Inválida!");
	if (!gorduraValida || paciente.gordura.length == 0) erros.push("Gordura Inválida!");
	if (paciente.nome.length == 0) erros.push("Nome Inválido!");

	return erros;
}

function validaGordura(gordura)
{
	var gorduraValida = true;
	if(gordura < 0  || gordura > 100)
	{
		gorduraValida = false;
	}
	return gorduraValida
}

function exibeMensagensDeErros(erros)
{
	var ul = document.querySelector("#mensagens-erro");
    ul.innerHTML = ""

    erros.forEach(function(erro)
    {
        var li = document.createElement("li");
        li.textContent = erro;
        ul.appendChild(li);
    });
}

/*   Exmplifying forEach

// For each element in the array: update the value with 10 times the original value:

var numbers = [65, 44, 12, 4];
numbers.forEach(myFunction)

function myFunction(item, index, arr)
{
	arr[index] = item * 10;
}

// output: 650,440,120,40

*/

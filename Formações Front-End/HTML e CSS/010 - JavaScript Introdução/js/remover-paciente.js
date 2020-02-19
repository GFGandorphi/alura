var corpoTabela = document.querySelector("#tabela-pacientes");

corpoTabela.addEventListener("dblclick", function(event)
{
	var alvoEvento = event.target;
	var paiAlvo = alvoEvento.parentNode;
	paiAlvo.classList.add("fadeOut");
	setTimeout(function()
		{
			paiAlvo.remove();
		}, 500);
});

/*  element.addEventListener(event, function, useCapture)
When the event occurs, an event object is passed to the function as the first parameter.
The type of the event object depends on the specified event.
*/

/*
pacientes.forEach(function(paciente)
{
	paciente.addEventListener("dblclick", function()
	{
		this.remove();
		// this se refere ao dono do evento. paciente nesse caso.
	});
});
*/
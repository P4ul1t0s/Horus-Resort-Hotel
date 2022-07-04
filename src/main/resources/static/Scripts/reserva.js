let listaReservas = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/reservas",
    success: function(arrayReservas){
        for (let reserva of arrayReservas) {
            listaReservas +=`<li class="objetos">
                                <p>${reserva.checkin}</p>
                                <p>${reserva.checkout}</p>
                                <p>${reserva.status}</p>
                                <p>${reserva.adultos}</p>
                                <p>${reserva.criancas}</p>
                                <p>${reserva.valorTotal}</p>
                                <p>${reserva.id}</p>
                            </li>`
        }
        $("#lista-reserva").append(listaReservas)

        document.querySelectorAll(".objetos").forEach(card =>{
            //pegando os elementos de "card" e setando em variaveis
            let checkin = card.firstElementChild.innerText
            let checkout = card.firstElementChild.nextElementSibling.innerText
            let status = card.firstElementChild.nextElementSibling.nextElementSibling.innerText
            let adultos = card.firstElementChild.nextElementSibling.nextElementSibling.nextElementSibling.innerText
            let criancas = card.firstElementChild.nextElementSibling.nextElementSibling.nextElementSibling.nextElementSibling.innerText
            let valorTotal = card.lastElementChild.previousElementSibling.innerText
            let id = card.lastElementChild.innerText
        
            //quando clicar num card, as variaveis com os valores dele vão preencher os inputs do formulario
            card.addEventListener("click", ()=>{
                document.querySelector("#id-reserva").innerText = id
                document.querySelector("input[name='checkin']").value = checkin
                document.querySelector("input[name='checkout']").value = checkout
                document.querySelector("input[name='status']").value = status
                document.querySelector("input[name='adultos']").value = adultos
                document.querySelector("input[name='criancas']").value = criancas
                document.querySelector("input[name='valorTotal']").value = valorTotal
                document.querySelector("input[name='id']").value = id
            })
        })
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})

function editar(id){
    $.ajax({
        type:"GET",
        dataType:"json",
        url:"/api/reservas" + id,
        success: function (data) {
            addCliente();
            $("#containerCadCliente").find("#id_cliente").val(data.id);
            $("#containerCadCliente").find("#nome").val(data.nome);
            $("#containerCadCliente").find("#email").val(data.email);
        },
        error: function (data) {
            alert("Ops! algo deu errado ao carregar os dados dos clientes");
        },
        beforeSend: function () {
        }
    })
}



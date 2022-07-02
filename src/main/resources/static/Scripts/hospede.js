const menuExpandidoH = document.querySelector(".expandidoH")
        const menuComprimidoH = document.querySelector(".comprimidoH")
        const menuH = document.querySelector(".menuH")

        function openOrCloseMenu(){
            if(menuH.getAttribute("class").includes("comprimidoH")){
                openMenu()
            } else{
                closeMenu()
            }
        }        
        
        function openMenu(){
            menuComprimidoH.classList.remove("comprimidoH")
            menuComprimidoH.classList.add("expandidoH")

            document.querySelector(".menuH h3").innerText = "Hórus System"
            document.querySelector(".menuH h4").innerText = "nome Hospede"
            document.querySelector(".menuH h5").innerText = "32/02/2022 - 25:04"
        }

        function closeMenu(){
            menuComprimidoH.classList.remove("expandidoH")
            menuComprimidoH.classList.add("comprimidoH")

            document.querySelector(".menuH h3").innerText = ""
            document.querySelector(".menuH h4").innerText = ""
            document.querySelector(".menuH h5").innerText = ""
        }
        
        document.querySelectorAll(".objetosH").forEach(blocoHospede =>{
            let nomeHospede = blocoHospede.firstElementChild.nextElementSibling.innerText
            let cpfHospede = blocoHospede.firstElementChild.nextElementSibling.innerText
            let telefoneHospede = blocoHospede.firstElementChild.nextElementSibling.innerText
            let emailHospede = blocoHospede.firstElementChild.nextElementSibling.innerText
            let senhaHospede = blocoHospede.firstElementChild.nextElementSibling.innerText
        
            blocoHospede.addEventListener("click", ()=>{
                document.querySelector("#selected-nome").value = nomeHospede
                document.querySelector("#selected-cpf").value = cpfHospede
                document.querySelector("#selected-email").value = telefoneHospede
                document.querySelector("#selected-email").value = emailHospede
                document.querySelector("#selected-senha").value = senhaHospede
            })
        })
    

//======================AJAX==============================
let hospede = ""

$.ajax({
    type: "GET", 
    dataType: "json", 
    url:"/api/hospede",
    success: function(arrayHospede){
        for (let hospede of arrayHospede) {
            hospede +=`<li class="objetos">
                                ${hospede.nome}
                            
                            
                            </li>`
        }
        $("#lista-hospede").append(hospede)
    },
    error: function(){
        
    },
    beforeSend: function(){
        
    }
})
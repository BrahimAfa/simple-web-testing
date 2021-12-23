let menyButtons = document.querySelectorAll("button[id*='btn']")

menyButtons.forEach( button => button.addEventListener('click',function (){
    const buttonId = this.id
    if (buttonId == 'btnPregled'){
        window.location.href = '../../../worker/pregledWorker';
    }
    if (buttonId == 'btnOdjaviSe'){
        window.location.href = '../';
    }
    if(buttonId == 'btnEtaloniranje'){
        window.location.href = '../../../worker/workbench';
    }
    if(buttonId == 'btnPromeniSet'){
        window.location.href = '../../../worker/promeniSet';
    }
    if(buttonId == 'btnStampaj'){
        window.location.href = '../../../worker/print';
    }

}))
let saveButton = document.querySelector("button[id*='btnSacuvaj']")

saveButton.addEventListener('click',function () {

    document.getElementById("frmInfo").submit();
})
let menyButtons = document.querySelectorAll("button[id*='btn']")

menyButtons.forEach( button => button.addEventListener('click',function (){
    const buttonId = this.id
    if (buttonId == 'btnPregled'){
        window.location.href = '../../../admin/pregledAdmin';
    }
    if (buttonId == 'btnOdjaviSe'){
        window.location.href = '../';
    }
    if(buttonId == 'btnEtaloniranje'){
        window.location.href = '../admin/workbenchAdmin';
    }
    if(buttonId == 'btnAdmin'){
        window.location.href = '../../../admin/admin'
    }
    if(buttonId == 'btnPromeniSet'){
        window.location.href = '../admin/adminPromeniSet';
    }
    if(buttonId == 'btnStampaj'){
        window.location.href = '../admin/printAdmin';
    }

}))

let saveButton = document.querySelector("button[id*='btnSacuvaj']")

saveButton.addEventListener('click',function () {

    document.getElementById("frmPM100").submit();
})
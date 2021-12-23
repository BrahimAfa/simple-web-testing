let menyButtons = document.querySelectorAll("button[id*='btn']")

menyButtons.forEach( button => button.addEventListener('click',function (){
    const buttonId = this.id
    if (buttonId == 'btnPregled'){
        window.location.href = '../../../user/pregledUser';
    }
    if (buttonId == 'btnOdjaviSe'){
        window.location.href = '../';
    }
    if(buttonId == 'btnNoviSet'){
        window.location.href = '../user/dodajSetUser';
    }

}))
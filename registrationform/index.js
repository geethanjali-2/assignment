function validateAndSubmit() {
    const firstName = document.getElementById("firstName").value;
    const lastName = document.getElementById("lastName").value;
    const dob = document.getElementById("dob").value;
    const country = document.getElementById("country").value;
    const gender = Array.from(document.querySelectorAll("input[name='gender']:checked")).map(e => e.value).join(', ');
    const profession = document.getElementById("profession").value;
    const email = document.getElementById("email").value;
    const mobile = document.getElementById("mobile").value;


    if (!firstName || !lastName || !dob || !country || !profession || !email || !mobile) {
        alert("Please fill in all mandatory fields before submitting.");
    } 
    else 
    {    
        document.getElementById("popup-firstName").textContent = firstName;
        document.getElementById("popup-lastName").textContent = lastName;
        document.getElementById("popup-dob").textContent = dob;
        document.getElementById("popup-country").textContent = country;
        document.getElementById("popup-gender").textContent = gender;
        document.getElementById("popup-profession").textContent = profession;
        document.getElementById("popup-email").textContent = email;
        document.getElementById("popup-mobile").textContent = mobile;

        document.getElementById("popup").style.display = "flex";
    }
}

function resetForm() {
    document.getElementById("surveyForm").reset();
}

function closePopupAndResetForm() {
    closePopup();
    resetForm();
}

function closePopup() {
    document.getElementById("popup").style.display = "none";
}


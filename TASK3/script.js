function validateForm() {
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    
    if (name === "" || email === "") {
        alert("Name and email must be filled out");
        return false;
    }
    
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        alert("Invalid email address");
        return false;
    }

    alert("Form submitted successfully!");
    return true;
}

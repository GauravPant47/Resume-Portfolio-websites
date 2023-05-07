const cart = {
    experience: "5+ years",
    jobPosition: "Web Developer",
    companyName: "Acme Inc.",
    companyLocation: "New York City",
    jobDescription: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
};

document.getElementById("experience").innerHTML = cart.experience;
document.getElementById("job-position").innerHTML = cart.jobPosition;
document.getElementById("company-name").innerHTML = cart.companyName;
document.getElementById("company-location").innerHTML = cart.companyLocation;
document.getElementById("job-description").innerHTML = cart.jobDescription;

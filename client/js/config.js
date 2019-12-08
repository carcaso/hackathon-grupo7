const ip = "127.0.0.1:8080";
const url = "http://" + ip + "/help7hearts/api/charity/list";

const test_url = "https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=1000&api_key=McdzPzQpZs86Qx3IX07YJkJmuOe5GLujB5djINJd";

const dataIfCatch = [
    {
        id: 1,
        name: "place holder name",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "true",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 2,
        name: "another name",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "true",
        hasVolunteeringDemand: "false",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 3,
        name: "lorem ipsum sit",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "false",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 4,
        name: "place holder name 2",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "false",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 5,
        name: "place holder name 3",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "true",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 6,
        name: "place holder name 4",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "true",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 7,
        name: "name",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "true",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    },
    {
        id: 8,
        name: "holder holder holder",
        description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed a nunc eu lorem fermentum lobortis. Etiam nec dictum mauris. Sed odio turpis, egestas cursus nulla ac, posuere pulvinar nunc.",
        hasDonationDemand: "true",
        hasVolunteeringDemand: "true",
        phone: 999999999,
        email: "place@charity.com",
        category: "health"
    }
]
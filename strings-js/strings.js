const msg = 'Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht und hat es einfach gemacht.';
console.log(msg);

console.log('Aufgabe 1: ' + msg.charAt(0));
console.log('Aufgabe 1: ' + msg.charAt(29));



const vorname = 'Elias';
const nachname = 'Akbari';

console.log('Aufgabe 2: ' + msg.localeCompare(vorname));
console.log('Aufgabe 2: ' + msg === vorname);
console.log('Aufgabe 3: ' + vorname.concat(" " + nachname));
// console.log('Aufgabe 3: ' + vorname.concat(" ", nachname));  mit Komma kann man auch mehrere Parameter eingeben


if (msg.includes('gemacht')) {
    console.log('Yes, gemacht gibts')
} else if (msg.includes('vorkommen')) {
    console.log('Yes, vorkommen gibts!')
}


const x1 = 'xEins';
const x2 = 'xEins';
console.log(x1 === x2);

console.log(msg.indexOf('d'));

const leer = "";
if (leer.length === 0) {
    console.log('I\'m empty :/');
}

let z;
if (z == null) {
    console.log('z is null');
}

console.log(msg.length);


console.log('Die gesuchten Wörter sind: \n' + msg.substring(5, 11) + ' und ' + msg.substring(85, 92));










const lecker = {
    cheese: 6,
    corn: 2,
    meat: 9,
    onion: 4,
    pea: 2,
    oregano: 8,
    potato: 3,
    tomato: 4
};

console.log(lecker['cheese']);

const dinge = ["Tomaten", false, 42];
dinge.push("Knödel");
console.log(dinge[3]);
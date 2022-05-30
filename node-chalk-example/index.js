import chalk from 'chalk';

console.log(chalk.blue('Hello world!'));

const msg = 'Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht und hat es einfach gemacht.';

console.log((chalk.blue.bgGreenBright.bold('Alle sagten, das geht nicht. Dann kam einer, der wusste das nicht und hat es einfach gemacht.')));

console.log(chalk.bgCyan.italic('Aufgabe 1: ' + msg.charAt(0)));
console.log('Aufgabe 1: ' + msg.charAt(29));



const vorname = 'Elias';
const nachname = 'Akbari';

const warning = chalk.hex('#FFA500');

console.log(warning('Aufgabe 2: ' + msg.localeCompare(vorname)));
console.log('Aufgabe 2: ' + msg === vorname);
console.log('Aufgabe 3: ' + vorname.concat(" " + nachname));
// console.log('Aufgabe 3: ' + vorname.concat(" ", nachname));  mit Komma kann man auch mehrere Parameter eingeben


if (msg.includes('gemacht')) {
    console.log(chalk.greenBright.bgCyanBright.underline.bold('Aufgabe 4: Yes, gemacht gibts'))
} else if (msg.includes('vorkommen')) {
    console.log(('Aufgabe 4: Yes, vorkommen gibts!'))
}


const x1 = 'xEins';
const x2 = 'xEins';
console.log('Aufgabe 5: '+x1 === x2);

console.log(msg.indexOf('Aufgabe 6: '+'d'));

const leer = "";
if (leer.length === 0) {
    console.log(chalk.blue('Aufgabe 7: I\'m empty :/'));
}

let z;
if (z == null) {
    console.log('Aufgabe 8: z is null');
}

console.log('Aufgabe 9: '+msg.length);


console.log(chalk.magenta.underline('Aufgabe 10: Die gesuchten Wörter sind: \n' + msg.substring(5, 11) + ' und ' + msg.substring(85, 92)));

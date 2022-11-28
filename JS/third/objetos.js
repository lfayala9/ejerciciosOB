const myself = {
    nombre: 'Luis',
    apellido: 'Ayala',
    edad: 24,
    altura: 1.81,
    eresDesarrollador: true //not yet
}

let age = myself.edad;

let arrayMy = [myself, {nombre: 'Joe', apellido: 'Fake', edad: 44, esDev: false}, {nombre: 'Jordan', apellido: 'NotReal', edad: 26, esDev: false}]

arrayMy.sort((a,b)=> b.edad - a.edad)

console.log(arrayMy)

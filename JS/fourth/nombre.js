class estudiante {
    nombre = 'luis'
    asignaturas = ['Javascript', 'HTML', 'CSS']

    obtenDatos(){
        return {nombre, asignaturas }
    }
}

let luis = new estudiante()

console.log(obtenDatos())
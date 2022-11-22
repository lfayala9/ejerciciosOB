//Primera parte

let compra = ['Café', 'Azucar', 'Shampoo', 'Carne', 'Pollo']

let nuevaCompra = (compra.unshift('Aceite de Girasol'))

console.log(compra)

let eliminarCompra = compra.shift()

console.log(compra)


// Peliculas
const peliculas = [
    {titulo: 'Paprika', director: 'Satoshi Kon', fecha: 2007},
    {titulo: 'Fury Road', director: 'George Miller', fecha: 2015},
    {titulo: 'Your Name', director: 'Makoto Shinkai', fecha: 2017}
]

let fechaPeliculas = peliculas.filter((pelicula)=> pelicula.fecha > 2010)

console.log(fechaPeliculas)

let directorPelicula = peliculas.map((pelicula)=> pelicula.director)

console.log(directorPelicula)

let tituloPelicula = peliculas.map((pelicula)=> pelicula.titulo)

console.log(tituloPelicula)

let concatPeliculas = directorPelicula.concat(tituloPelicula)

console.log(concatPeliculas)

let spreadPeliculas = [...directorPelicula, ...tituloPelicula]

console.log(spreadPeliculas)
// - Una nueva lista que concatene la lista de directores y la lista de los títulos (utilizando el factor de propagación)
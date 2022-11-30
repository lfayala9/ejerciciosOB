function trueS(){
    return true;
}

let promesa = new Promise((resolve, reject)=>{
    if(true){
        setTimeout(()=>{
            resolve()
        },5000)
    }else{
        reject()
    }
})

promesa
    .then(()=> console.log('Hola soy una promesa'))
    .catch(()=> console.log('ERROR'))

function* pares(){
    let par = 0
    while(true){
        par += 2
        if(par === 10){
            return par
        }
        yield par
    }
}

let par = pares()

console.log(par.next().value)
console.log(par.next().value)
console.log(par.next().value)


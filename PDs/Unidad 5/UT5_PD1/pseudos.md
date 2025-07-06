<!--
insertar(unaPalabra)
COM
nodo = this
para cada c desde 0 hasta unaPalabra.largo() hacer
    índice <- unaPalabra.caracterEnPosicion(c) - a
    si (nodo.hijos[indice] = nulo)
        nodo.hijos[indice] <- nuevo TnodoTrie()
    fin si

    nodo <- nodo.hijos[indice]
    fin para cada

nodo.esPalabra = verdadero
FIN

buscarNodoTrie(s)
COM
    nodo <- this
    para cada c hasta s.largo() hacer
        indice <- s.caracterEnPosicion(c) - a
        si (nodo.hijos[indice] == nulo)
            devolver nulo
        fin si
        nodo <- nodo.hijos[indice]
    fin para cada
    devolver nodo
FIN

buscar(s)
COM
    nodo <- buscarNodoTrie(s)
    si (nodo <> nulo y nodo.esPalabra)
        devolver 1
    fin si
    devolver 0
FIN

-->

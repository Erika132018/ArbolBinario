class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    void agregarNodo(int valor) {
        raiz = agregarNodoRecursivo(raiz, valor);
    }

    Nodo agregarNodoRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            nodo = new Nodo(valor);
            return nodo;
        }

        if (valor < nodo.valor)
            nodo.izquierdo = agregarNodoRecursivo(nodo.izquierdo, valor);
        else if (valor > nodo.valor)
            nodo.derecho = agregarNodoRecursivo(nodo.derecho, valor);

        return nodo;
    }

    void preorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            preorden(nodo.izquierdo);
            preorden(nodo.derecho);
        }
    }

    void inorden(Nodo nodo) {
        if (nodo != null) {
            inorden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            inorden(nodo.derecho);
        }
    }

    void postorden(Nodo nodo) {
        if (nodo != null) {
            postorden(nodo.izquierdo);
            postorden(nodo.derecho);
            System.out.print(nodo.valor + " ");
        }
    }
}
public class Clase2 {
    public static void main(String[] args){
        //Variables:
        int contador;
        contador = 23;
        System.out.println("Contador: "+contador);

        //Operadores: +, -, *, /, etc...

        //Condicionales: if, else, if else, switch

        //Metodos:
        /*
         * void: no devuelve nada
         * ej:
         * public void funcionHelloWorld(){
         *     System.out.println("Hello World");
         *     //No devuelve ningun valor duh
         * }
         * 
         
         * 
         * 
        */
        /*RELACIONES EN OBJETOS:
         * 
         * - Cliente-Servidor
         * 
         * - Herencia
         * 
         */
        /*CLASES:
         * 
         * class miClasePrivada{
         *     int miNum = 1;
         *     String miString = new String("HOla");
         * }
         * 
         * 
         */

         /*PAQUETES:
          * Solo vamos a usar el paquete "System"
          */

        /*Pasajes por valor y por referencia:
         * 
         * 
         * 
         */

         String myString = new String("964");
         int myNum = Integer.parseInt(myString);

         System.out.println(myNum);

         /*
            TDA (Clases y Objetos Abstractos, osea pilas y colas)
            Tienen estados y comportamientos

            Tiene su parte del usuario y del funcionamiento, relacionados por la interfaz
            Resumen:

                no hay resumen :V


          */
        
          /*PILA TDA (lifo)
           * 
           * Metodos:
           * 
           * -Apilar
           * -Desapilar
           * -Tope
           * -PilaVacia
           * -InicializarPila
           * 
           * Interfaz de PilaTDA:
           * 
           * 
           */


           /*Implementacion TDA (Arrays):

            Para implementar un TDA en Java, se crea una clase con ka palabra reservada "implements"
            Luego definimos la estructura de datos y dps los metodos

            ej:

            public class PilaTF implements PilaTDA{

                int[] a;
                int indice;

                public void InicializarPila(){
                    a = new int[100];
                    indice = 0;
                }

                public void Apilar(int x){
                    a[indice] = x;
                    indice++;
                }

                public void Desapilar(){
                    indice--; //No hace falta eliminar el ultimo ya que simplemente lo ignora.
                }

                public boolean PilaVacia(){
                    return (indice == 0);
                }

                public int Tope(){
                    return a[indice -1];
                }

            }
            
            */

            /*Variante de implementacion: 
             * 
             * ej:
             * 
             * public class PilaTI implements PilaTDA{
             *     int[] a;
             *     int indice;
             * 
             *     public void InicializarPila(){
             *         a = new int[100];
             *         indice = 0;
             * }
             * 
             *     public void Apilar(){
             *         for (int x = indice -1 ; i >= 0; i--)
             *             a[i+1] = a[i];
             *         a[0] = x;
             *         indice--;
             * }
             *     
             * 
             * 
             * }
             * 
             * 
             * 
             * 
             * 
             * 
             */




    }
}

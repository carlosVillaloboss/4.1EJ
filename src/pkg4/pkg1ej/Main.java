/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.pkg1ej;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros cuentaAhorros = new CuentaAhorros(15000, 5.0f);
        
        cuentaAhorros.consignar(5000);
        cuentaAhorros.retirar(3000);
        cuentaAhorros.extractoMensual();
        cuentaAhorros.imprimir();
    }
}

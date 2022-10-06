# Work 02 - POO Java
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/laraagr1/T2_POO_2022.2)
![GitHub language count](https://img.shields.io/github/languages/count/laraagr1/T2_POO_2022.2)
![GitHub commit activity](https://img.shields.io/github/commit-activity/w/laraagr1/T2_POO_2022.2)

## Information of project
- This repository contains questions from my second work in the Java OOP course taught by Professor [Roger Moura](https://github.com/rogermsarmento) from my Computer Technician course at IFCE Campus Fortaleza!
- My Duo: [Erick Gomes](https://github.com/erickgms01)

<div align="center">
  <img height="70" width="80" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg">
</div>

### Descriptions of issues
| Issues | Description |
| ------------- |:-------------|
|[01](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/01%20-%20ParOuImpar)|Write a code that receives a user number and returns if it is odd or even.|
|[02](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/02%20-%20Op%C3%A7%C3%B5es)|Make an options menu where, where the user has the option of adding two numbers or taking the square root of another number.|
|[03](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/03%20-%20Equa%C3%A7%C3%A3oSegundoGrau)|This code solves a quadratic equation.|
|[04](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/04%20-%20DataHora)|This code takes day/month/year and Hour:Min:Sec from the user's machine, and displays them.|
|[05](https://github.com/Laraagr1/T2_POO_2022.2/blob/main/issuedoentdid/issuedosentdid.md)|
|[06](https://github.com/Laraagr1/T2_POO_2022.2/blob/main/issuedoentdid/issuedosentdid.md)|
|[07](https://github.com/Laraagr1/T2_POO_2022.2/blob/main/issuedoentdid/issuedosentdid.md)|
|[08](https://github.com/Laraagr1/T2_POO_2022.2/blob/main/issuedoentdid/issuedosentdid.md)|
|[09](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/09%20-%20Numbers)|Collect x amount of numbers from the user and display it: their average, average only of evens, largest of them, smallest and the percentage of odd numbers that the user entered.|
|[10](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/10%20-%20Tabuada)|Write the multiplication table from 1 to 10.|

- - -
### Difficulties Faced
- [Issue 10](https://github.com/Laraagr1/T2_POO_2022.2/tree/main/10%20-%20Tabuada)

  This code looks complete and completely functional, yes it was, but I faced a surreal formatting error, which gave me a little headache, but I managed to solve it,     putting the Strings inside variables, and using repetition structures to see if they were from the size I wanted and then filtering them, to come out as I wanted.
  I think it was the only difficulty I had in the entire code!
- - -
   ```java:
  package tabuada;

  import java.util.Scanner;
  import cores.Cores;
      
  public class Main {

    public static void main(String[] args) {
      for (int i = 1;i <= 10; i++) {
        System.out.println(Cores.BLACK + Cores.WHITE_BACKGROUND +  "||=--=--=--=--=--" + Cores.BLUE + Cores.WHITE_BACKGROUND + "Tabuada do " + i + Cores.RESET + Cores.BLACK + Cores.WHITE_BACKGROUND + "--=--=--=--=--=||");
          for(int j = 1; j <= 10;j++) {
            System.out.println("||                " + i + " x " + j + " = " + j*i + "               ||");
            }
            System.out.println("||=--=--=--=--=--=--=--=--=--=--=--=--=--=--=||" + Cores.RESET );
            System.out.println();}
       }
  } 
  ```
- - -
- Result:

  ![ps_CodeTable](https://user-images.githubusercontent.com/110913912/192514534-d2c115db-9c77-4ed3-85f1-aed6f7106ce9.png)


- - - 


- Fixed: 

  ![ps_CodeTableFixed](https://user-images.githubusercontent.com/110913912/192514865-ec55c3a5-2e66-4f2a-9a32-a9833fa526ab.png)

  - Now, looks great :D 
- - -



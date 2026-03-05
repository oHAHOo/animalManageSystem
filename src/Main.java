import Animal.Animal;
import Animal.Cat;
import Animal.Dog;

import java.util.List;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        System.out.println("=== 동물원 관리 시스템 ===");
        System.out.println("1. 동물 등록");
        System.out.println("2. 동물 목록 보기");
        System.out.println("3. 동물과 놀기");
        System.out.println("4. 먹이주기");
        System.out.println("5. 울음소리 듣기");
        System.out.println("6. 동물 상태 확인");
        System.out.println("7. 종료");
        System.out.print("메뉴를 선택하세요: ");

        while(true){

            if(!sc.hasNextInt()){
                System.out.println("숫자를 입력하세요");
                sc.next();
                continue;
            }
            int menu = sc.nextInt();
            if(menu == 7){break;}
            switch(menu){
                case 1:{
                    System.out.print("동물 이름을 입력하세요: ");
                    String name = sc.next();
                    System.out.print("동물 나이를 입력하세요: ");
                    int age = sc.nextInt();
                    System.out.print("동물 종류를 선택하세요 (1.강아지 2.고양이): ");
                    int type = sc.nextInt();

                    switch(type){
                        case 1:{
                            zoo.addAnimal(new Dog(name, age));
                            System.out.println(name+"(강아지,"+age+"살)가 등록되었습니다.");
                            break;
                        }
                        case 2:{
                            zoo.addAnimal(new Cat(name, age));
                            System.out.println(name+"(고양이,"+age+"살)가 등록되었습니다.");
                            break;
                        }
                    }break;

                }
                case 2:{
                    List<Animal> animal = zoo.getAnimals();
                    if(animal.isEmpty()){
                        System.out.println("등록된 동물이 없습니다.");
                        break;
                    }
                    for(int i = 0; i < animal.size(); i++){
                        Animal a = animal.get(i);
                        if(a instanceof Dog){
                            System.out.println((i+1)+"." + a.getName() + "(강아지)");
                        }
                        else if(a instanceof Cat){
                            System.out.println((i+1)+"." + a.getName() + "(고양이)");
                        }
                    }break;
                }
                case 3:{
                    List<Animal> animal = zoo.getAnimals();
                    if(animal.isEmpty()){
                        System.out.println("등록된 동물이 없습니다.");
                        break;
                    }
                    System.out.println("같이 놀 동물을 선택하세요.");
                    for(int i = 0; i < animal.size(); i++){
                        Animal a = animal.get(i);
                        if(a instanceof Dog){
                            System.out.println((i+1)+"." + a.getName() + "(강아지)");
                        }
                        else if(a instanceof Cat){
                            System.out.println((i+1)+"." + a.getName() + "(고양이)");
                        }
                    }

                    if(!sc.hasNextInt()){
                        System.out.println("숫자를 입력하세요");
                        sc.next();
                        continue;
                    }
                    int select = sc.nextInt();

                    if(select < 1 || select > animal.size()){
                        System.out.println("등록되지 않은 동물입니다");
                    }
                    Animal a = animal.get(select-1);
                    a.play();
                    System.out.println(a.getName() + "의 행복도는" + a.getHappiness() + "입니다");
                    break;
                }
                case 4:{
                    List<Animal> animal = zoo.getAnimals();
                    if(animal.isEmpty()){
                        System.out.println("등록된 동물이 없습니다.");
                        break;
                    }
                    System.out.println("먹이를 줄 동물을 선택하세요.");
                    for(int i = 0; i < animal.size(); i++){
                        Animal a = animal.get(i);
                        if(a instanceof Dog){
                            System.out.println((i+1)+"." + a.getName() + "(강아지)");

                        }
                        else if(a instanceof Cat){
                            System.out.println((i+1)+"." + a.getName() + "(고양이)");
                        }
                    }

                    if(!sc.hasNextInt()){
                        System.out.println("숫자를 입력하세요");
                        sc.next();
                        continue;
                    }
                    int select = sc.nextInt();

                    if(select < 1 || select > animal.size()){
                        System.out.println("등록되지 않은 동물입니다");
                    }
                    Animal a = animal.get(select-1);
                    a.eat();
                    System.out.println(a.getName() + "의 배고픔은" + a.getHunger() + "입니다");
                    break;
                }
                case 5:{
                    List<Animal> animal = zoo.getAnimals();
                    if(animal.isEmpty()){
                        System.out.println("등록된 동물이 없습니다.");
                        break;
                    }
                    System.out.println("어느 동물의 울음소리를 듣겠습니까?");
                    for(int i = 0; i < animal.size(); i++){
                        Animal a = animal.get(i);
                        if(a instanceof Dog){
                            System.out.println((i+1)+"." + a.getName() + "(강아지)");
                        }
                        else if(a instanceof Cat){
                            System.out.println((i+1)+"." + a.getName() + "(고양이)");
                        }
                    }

                    if(!sc.hasNextInt()){
                        System.out.println("숫자를 입력하세요");
                        sc.next();
                        continue;
                    }
                    int select = sc.nextInt();

                    if(select < 1 || select > animal.size()){
                        System.out.println("등록되지 않은 동물입니다");
                    }
                    Animal a = animal.get(select-1);
                    a.makeSound();
                    break;
                }
                case 6:{
                    List<Animal> animal = zoo.getAnimals();
                    if(animal.isEmpty()){
                        System.out.println("등록된 동물이 없습니다.");
                        break;
                    }
                    System.out.println("상태를 확인 할 동물을 선택하세요.");
                    for(int i = 0; i < animal.size(); i++){
                        Animal a = animal.get(i);
                        if(a instanceof Dog){
                            System.out.println((i+1)+"." + a.getName() + "(강아지)");
                        }
                        else if(a instanceof Cat){
                            System.out.println((i+1)+"." + a.getName() + "(고양이)");
                        }
                    }

                    if(!sc.hasNextInt()){
                        System.out.println("숫자를 입력하세요");
                        sc.next();
                        continue;
                    }
                    int select = sc.nextInt();

                    if(select < 1 || select > animal.size()){
                        System.out.println("등록되지 않은 동물입니다");
                    }
                    Animal a = animal.get(select-1);
                    zoo.checkAnimal(a);
                    break;
                }
                default:
                    System.out.println("1~7사이의 숫자를 입력하세요");
            }
        }
    }
}
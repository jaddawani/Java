
import java.util.Random;
public class Bankaccount{

private
long accountnumber;
long rand(){
    Random r = new Random();
    accountnumber= r.nextInt(100000000-0);
return accountnumber;
}
double balance;
double savingbalacne = 0;


static double totalamount=0;
public 
Bankaccount(double balance){
rand();
    this.balance = balance;
    totalamount++;
    
}

void getbalance(){

    System.out.println(balance);
}


void getsavings(){
    System.out.println(savingbalacne);
}

void setbalance(int amount){
    
    this.balance+=amount;
    

}
void setsavingbalance(int amount){
    
    this.savingbalacne+=amount;

}

void withdrawl(int amount){

    this.balance-=amount;
}

void savingwithdrawl(int amount){

    this.savingbalacne-=amount;
}

void printamount(){

    System.out.println(balance);
     System.out.println(savingbalacne);


}


}
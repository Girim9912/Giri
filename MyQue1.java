
public class MyQue1 {
int ele[],front=-1,rear=-1;
MyQue1(int cc) {
	ele=new int[cc];
	
}
boolean enque(int data) {
	if(rear==ele.length-1) {
		System.out.println("que is full");
		return false;
	}
	if(front==-1)
		front=0;
	ele[++rear]=data;
	return true;
}
int deque() {
	if(front==-1) {
		System.out.println("que is empty");
		return 0;
	}
	int data=ele[front++];
	if(front>rear)
		front=rear=-1;
	return data;
	
}
public String toString() {
	String st="[";
	for(int i=front;i<=rear;i++) {
		st=st+ele[i];
		if(i<rear)
			st=st+",";
	}
	return st+"]";
	
}
public static void main(String[] args) {
	MyQue1 mq=new MyQue1(8);
	System.out.println(mq.enque(24));
	System.out.println(mq.enque(54));
	System.out.println(mq.deque());
}
}


public class LinkListProgram {

	public static void main(String[] args) {
		CustomLinkList cs=new CustomLinkList();
    for(int i=1; i<5; i++)
    {
    	cs.addInLast(i);
    }
    
    cs.display();
    cs.deleteFromStart();
    System.out.println("after deletion");
    cs.display();
    System.out.println("after deletion from last");
    cs.deleteElement(3);
    cs.display();
    if(cs.isCyclic())
    {
    	 System.out.println("cycle");
    }else
    {
    	 System.out.println("not cycle");
    }
	}
}
class CustomLinkList
{
	Node root;
	
	
	public boolean isCyclic()
	{
	Node fast=root;
	Node slow=root;
	while(fast!=null&&fast.next!=null)
	{
		fast=fast.next.next;
		slow=slow.next;
		if(fast==slow)
		{
			return true;
		}
	}
	return false;
	}
	
	public void deleteElement(int i)
	{
		Node temp=root;
		while(temp.next!=null)
		{   if(temp.next.i==i)
			{
			//Node t=temp.next.next;
			   temp.next=temp.next.next;
			   break;
			}else
			{				
				temp=temp.next;
			}
		}
	}
	public void display()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.i);
			temp=temp.next;
		}
	}
	
	public void deleteFromStart()
	{
		if(root!=null)
		{
			Node temp=root.next;
			root=temp;
			
		}else
		{
			System.out.println("Not element in List");
		}
	}
	
	public void deleteFromLast()
	{
		if(root!=null)
		{
			Node temp=root;
			while(temp.next.next!=null)
			{
				temp=temp.next;		
			}
			temp.next=null;
		}else
		{
			System.out.println("Not element in List");
		}
	}
	
	
	public void addInFirst(int i)
	{
		Node node=new Node(i);
		if(root==null)
		{
			root=node;
		}
		else
		{
			Node temp=node;
			temp.next=root;
			root=temp;
			
		}
	}
	public void addInLast(int i)
	{
		Node node=new Node(i);
		if(root==null)
		{
			root=node;
		}else
		{
			Node head=root;
			while(head.next!=null)
			{
				head=head.next;
			}	
			Node temp=node;
            head.next=node;
		}
	}
}

class Node
{
	int i ;
	Node next;
	Node(int i)
	{
		this.i=i;
	}
}
package com.treeexample;

public class TreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t=new Tree();
		t.addNode(10);
		t.addNode(5);
		t.addNode(7);
		t.addNode(20);
		t.addNode(15);
		//t.countNode();
		t.inOrder();
	}

}

class Tree
{
	TreeNode root;
	public void addNode(int value)
	{
		root=addNode(root,value);
	}
	public TreeNode addNode(TreeNode node,int value)
	{
		TreeNode tempNode=new TreeNode(value);
		if(node==null)
		{
			node=tempNode;
		}else
		{
			if(value<=node.value)
			{
				node.left=addNode(node.left, value);
			}else
			{
				node.right=addNode(node.right, value);
			}
		}
		
	return node;
	}
	
	public void display()
	{
		
	}
	public void countNode()
	{
		int count=countNode(root);
		System.out.println(count);
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	private void inOrder(TreeNode node)
	{
		if(node!=null)
		{
			inOrder(node.left);
			System.out.println(node.value);
			inOrder(node.right);
		}
	}
	
	private int countNode(TreeNode node)
	{
	
		if(node==null)
		{
			return 0;
		}else
		{
			int count=1;
			count+=countNode(node.left);
			count+=countNode(node.right);
			return count;
		}
		
	}
	
}


class TreeNode
{
	int value;
    TreeNode left;
    TreeNode right;
    public TreeNode(int value) {
		this.value=value;
	}
}
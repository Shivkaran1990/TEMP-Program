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
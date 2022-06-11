package java_clases.Estructuras;

//import java_clases.main.Usuario;
// Java program for insertion in AVL Tree
class Node
{
	int key;
         int height;
	Node left, right;

	Node(int d)
	{
		key = d;
		height = 1;
	}
}

class AVLTree
{
 
	Node root;

	int height(Node N)
	{
		if (N == null)
			return 0;
		return N.height;
	}

	Node rotateRight(Node b)
	{
		Node a = b.left;
		Node c = a.right;

		a.right = b;
		b.left = c;

		b.height = Math.max(height(b.left), height(b.right)) + 1;
		a.height = Math.max(height(a.left), height(a.right)) + 1;

		return a;
	}

	Node rotateLeft(Node a)
	{
		Node b = a.right;
		Node c = b.left;

		b.left = a;
		a.right = c;

		a.height = Math.max(height(a.left), height(a.right)) + 1;
		b.height = Math.max(height(b.left), height(b.right)) + 1;

		return b;
	}

	int getBalance(Node N)
	{
		if (N == null)
			return 0;
		return height(N.left) - height(N.right);
	}

	Node insert(Node node, int key)
	{
           
            
		if (node == null)
			return (new Node(key));
                        
		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
                
		else 
			return node;
                
		node.height = 1 + Math.max(height(node.left),
							height(node.right));

		int balance = getBalance(node);
		if (balance > 1 && key < node.left.key)
			return rotateRight(node);

		if (balance < -1 && key > node.right.key)
			return rotateLeft(node);

		if (balance > 1 && key > node.left.key)
		{
			node.left = rotateLeft(node.left);
			return rotateRight(node);
		}

		if (balance < -1 && key < node.right.key)
		{
			node.right = rotateRight(node.right);
			return rotateLeft(node);
		}

		return node;
	}

	Node minValueNode(Node node)
	{
	    Node temp;
        for(temp=node;temp.left!=null;temp=temp.left);

		return temp;
	}

	Node deleteNode(Node root, long key)
	{
		if (root == null)
			return root;

		if (key < root.key)
			root.left = deleteNode(root.left, key);

		else if (key > root.key)
			root.right = deleteNode(root.right, key);

		else
		{

			if ((root.left == null) || (root.right == null))
			{
				Node temp = null;
				if (temp == root.left)
					temp = root.right;
				else
					temp = root.left;

				if (temp == null)
				{
					temp = root;
					root = null;
				}
				else 
					root = temp;
			}
			else
			{

				Node temp = minValueNode(root.right);

				root.key = temp.key;

				root.right = deleteNode(root.right, temp.key);
			}
		}

		if (root == null)
			return root;

		root.height = Math.max(height(root.left), height(root.right)) + 1;
    	        int balance = getBalance(root);

		if (balance > 1 && getBalance(root.left) >= 0)
			return rotateRight(root);

		if (balance > 1 && getBalance(root.left) < 0)
		{
			root.left = rotateLeft(root.left);
			return rotateRight(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0)
			return rotateLeft(root);

		if (balance < -1 && getBalance(root.right) > 0)
		{
			root.right = rotateRight(root.right);
			return rotateLeft(root);
		}

		return root;
	}

	void preOrder(Node node)
	{
		if (node != null)
		{
			System.out.print(node.key + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
	}

	
}
        

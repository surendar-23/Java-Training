class Tree_Traversal{
 static class Node {
  int data;Node left, right;};
 static Node newNode(int data){
  Node temp = new Node();
  temp.data = data;temp.left = null;temp.right = null;return temp;}
 static Node insert(Node root, int data){
  Node newnode = newNode(data);
  Node x = root;
  Node y = null;
  while (x != null) { y = x;
    if (data < x.data) x = x.left;
    else x = x.right; }
  if (y == null) y = newnode;
  else if (data < y.data) y.left = newnode;
  else y.right = newnode;
  return y;
 }
 static void Inorder(Node root)
 {
  if (root == null) return;
  else{
   Inorder(root.left); System.out.print(root.data + "->"); Inorder(root.right);}}
static void Preorder(Node root)
{
  if (root == null) return;
  else{
   System.out.print(root.data + "->");Preorder(root.left);Preorder(root.right);}}
static void Postorder(Node root)
{
  if (root == null) return;
  else{
   System.out.print(root.data + "->");Postorder(root.right);Postorder(root.left);}}
public static void main(String args[])
{
  Node root = null; root = insert(root, 50);
  insert(root, 30);insert(root, 20);insert(root, 40);insert(root, 70);insert(root, 60);insert(root, 80);
  System.out.println("Inorder Traversal");
  Inorder(root);
  System.out.println("");
  System.out.println("Preorder Traversal");
  Preorder(root);
  System.out.println("");
  System.out.println("Postorder Traversal");
  Postorder(root);
 }
}
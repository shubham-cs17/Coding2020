package tree;

/**
 * @author Shubham Kumar
 * @date 11/4/20
 */

class Node
{
  int data;
  Node left, right;

  public Node(int item)
  {
    data = item;
    left = right = null;
  }
}
package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class basics {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        // Build tree preorder
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder traversal
        public static void PreOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+ " ");
            PreOrder(root.left);
            PreOrder(root.right);
        }

        // Inorder Traversal 
        public static void Inorder(Node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);
        }

        // PostOrder
        public static void PostOrder(Node root){
            if(root== null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }

        // Lvl Order Traversal
        public static void LvlOrder(Node root){
            if(root== null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                     if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

       

    }

     // Height of a Tree
        public static int height(Node root){
            if(root==null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int height = Math.max(lh, rh)+1;
            return height;
        }


    public static void main(String[] args) {
        // int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();

        // Build tree- Preorder
        //Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        // preorder Traversal
        //tree.PreOrder(root);

        // Inorder traversal 
        //tree.Inorder(root);

        // Postorder
        //tree.PostOrder(root);

        // Level Order Traversal 
        //tree.LvlOrder(root);
        
        // Height of a Tree

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        System.out.println(height(root));

    }
    
}

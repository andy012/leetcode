package com.nowcoder.jd;

/**
 * Created by andy on 9/5/16.
 */
public class LowestCommonAncestor {
    class TreeNode{
        public TreeNode(int value) {
            this.value = value;
        }

        int value;
        TreeNode left,right;
    }
    public static void main(String[] args) {

        LowestCommonAncestor lowestCommonAncestor =new LowestCommonAncestor();

        TreeNode treeNode =   lowestCommonAncestor.new TreeNode(1);
        TreeNode treeNode1 =   lowestCommonAncestor.new TreeNode(2);
        TreeNode treeNode2 =   lowestCommonAncestor.new TreeNode(3);
        TreeNode treeNode3 =   lowestCommonAncestor.new TreeNode(4);
        TreeNode treeNode4 =   lowestCommonAncestor.new TreeNode(5);
        TreeNode treeNode5 =   lowestCommonAncestor.new TreeNode(6);
        TreeNode treeNode6 =   lowestCommonAncestor.new TreeNode(7);

        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        treeNode1.left = treeNode3;
        treeNode1.right = treeNode4;
        treeNode3.left=treeNode5;
        treeNode4.right = treeNode6;

        TreeNode r = findLowestCommonAncestor(treeNode,treeNode3,treeNode2);
        System.out.println(r.value);


    }

    public  static TreeNode findLowestCommonAncestor(TreeNode root,TreeNode first,TreeNode second){

        TreeNode[] ancestor=new TreeNode[1];
        ancestor[0]=null;
        findLowestCommonAncestor(root,ancestor,first,second);
        return ancestor[0];
    }

    public static int findLowestCommonAncestor(TreeNode root,TreeNode[] ancestor,TreeNode first,TreeNode second){

        if(ancestor[0] != null) return 0;
        if(root == null ) return 0;
        if(root.value == first.value || root.value == second.value){
            return  1;
        }else {
            int a=findLowestCommonAncestor(root.left,ancestor,first,second);
            int b=findLowestCommonAncestor(root.right,ancestor,first,second);
            if(a ==1 && b==1){
                ancestor[0] = root;
            }else if(a == 1 || b==1){
                return 1;
            }
            return 0;
        }

    }

}


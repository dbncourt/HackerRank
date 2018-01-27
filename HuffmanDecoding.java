    void decode(String s ,Node root){
        String decode = "";
        Node node = root;
        for (int i = 0; i < s.length(); ++i) {
            node = s.charAt(i) == '1' ? node.right : node.left;
            if(node.left == null && node.right == null){
                decode += node.data;
                node = root;
            }
        }
        System.out.print(decode);
    }

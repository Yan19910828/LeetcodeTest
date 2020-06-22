package demo;

public class Q2_addTwoNumbers {
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        ListNode dummy=new ListNode(0);
	        ListNode current=dummy;
	        int sum=0;
	        
	        while(l1!=null||l2!=null){
	            if(l1!=null){
	                sum+=l1.val;
	                l1=l1.next;
	            }
	            if(l2!=null){
	                sum+=l2.val;
	                l2=l2.next;
	            }
	            current.next=new ListNode(sum%10);
	            sum/=10;
	            current=current.next;
	        }
	        if(sum==1){
	            current.next=new ListNode(1);
	        }
	        return dummy.next;
	    }

}

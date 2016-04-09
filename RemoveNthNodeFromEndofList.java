package easy;

public class RemoveNthNodeFromEndofList
{
	public ListNode removeNthFromEnd(ListNode head, int n)
	{
		ListNode start = new ListNode(-1);
		ListNode slow = start, fast = start;
		slow.next = head;
		
		for(int i = 0; i < n; i++)
			fast = fast.next;
		
		while(fast.next != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		return start.next;
	}
}

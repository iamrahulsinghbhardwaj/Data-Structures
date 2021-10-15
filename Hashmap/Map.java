package HashMap;
import java.util.*;

public class Map<K,V> {
	ArrayList<MapNode<K,V>> buckets;
	int size;
	int numBuckets;
	
	public Map() {
		numBuckets=20;
		buckets=new ArrayList<>();
		
		for(int i=0;i<20;i++) {
			buckets.add(null);
		}
	}
	
	private int getBucketIndex(K key) {
		int hashcode=key.hashCode();
		return hashcode%numBuckets;
	}
	
	public int size() {
		return size;
	}
	
	public V removeKey(K key) {
		int bucketindex=getBucketIndex(key);
		MapNode<K,V> head=buckets.get(bucketindex);
		
		MapNode<K,V> prev=null;
		
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				if(prev==null) {
					buckets.set(bucketindex,head.next);
				}else {
					prev.next=head.next;
				}
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		
		return null;
	}
	
	public V getValue(K key) {
		int bucketindex=getBucketIndex(key);
		MapNode<K,V> head=buckets.get(bucketindex);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		
		return null;
	}
	
	public double loadfactor() {
		return (1.0*size)/numBuckets;
	}
	
	private void rehash() {
		ArrayList<MapNode<K,V>> temp=buckets;
		buckets=new ArrayList<>();
		
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		
		size=0;
		numBuckets=numBuckets*2;
		
		for(int i=0;i<numBuckets;i++) {
			MapNode<K,V> head=temp.get(i);
			while(head!=null) {
				K key=head.key;
				V Value=head.value;
				
				insert(key,Value);
				head=head.next;
				
			}
		}
	}
	
	public void insert(K key,V value) {
		int bucketindex=getBucketIndex(key);
		MapNode<K,V> head=buckets.get(bucketindex);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		
		head=buckets.get(bucketindex);
		MapNode<K,V> newElementNode=new MapNode<K,V>(key,value);
		size++;
		newElementNode.next=head;
		buckets.set(bucketindex,newElementNode);
		double loadfactor=(1.0*size)/numBuckets;
		if(loadfactor>0.7) {
			rehash();
		}
		
	}
	
	
}

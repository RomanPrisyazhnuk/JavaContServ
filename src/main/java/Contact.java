import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by AversiveDread on 10.06.2015.
 */
public class Contact {
    String firstName=null;
    String lastName=null;
    LocalDate  birthDate=null;
        Set <Place> placeSet =new Set<Place>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Place> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Place place) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Place> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }
        };
        Set <Hobby> hobbies = new Set<Hobby>() {
            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Hobby> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Hobby hobby) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Hobby> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }
        };



}

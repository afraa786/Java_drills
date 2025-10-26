import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;
import java.util.function.*;
import java.util.stream.*;

// Complex Java System Demonstration
public class ComplexSystem {

    // --- Observer Pattern ---
    interface Observer {
        void update(String event, Object data);
    }

    static class EventManager {
        private final Map<String, List<Observer>> listeners = new ConcurrentHashMap<>();

        public void subscribe(String eventType, Observer listener) {
            listeners.computeIfAbsent(eventType, k -> new CopyOnWriteArrayList<>()).add(listener);
        }

        public void unsubscribe(String eventType, Observer listener) {
            List<Observer> users = listeners.get(eventType);
            if (users != null) users.remove(listener);
        }

        public void notify(String eventType, Object data) {
            List<Observer> users = listeners.get(eventType);
            if (users != null) {
                users.forEach(listener -> listener.update(eventType, data));
            }
        }
    }

    // --- Singleton Database Simulation ---
    static class Database {
        private static volatile Database instance;
        private final Map<String, String> data = new ConcurrentHashMap<>();

        private Database() {}

        public static Database getInstance() {
            if (instance == null) {
                synchronized (Database.class) {
                    if (instance == null) {
                        instance = new Database();
                    }
                }
            }
            return instance;
        }

        public void put(String key, String value) {
            data.put(key, value);
        }

        public String get(String key) {
            return data.get(key);
        }
    }

    // --- Generic LRU Cache Implementation ---
    static class LRUCache<K, V> extends LinkedHashMap<K, V> {
        private final int capacity;

        public LRUCache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return size() > capacity;
        }
    }

    // --- Thread-safe Task Processor ---
    static class TaskProcessor {
        private final ExecutorService executor = Executors.newFixedThreadPool(4);
        private final ReentrantLock lock = new ReentrantLock();
        private final EventManager events = new EventManager();
        private final LRUCache<String, String> cache = new LRUCache<>(5);

        public void addObserver(String event, Observer observer) {
            events.subscribe(event, observer);
        }

        public void submitTask(String name, Supplier<String> task) {
            executor.submit(() -> {
                lock.lock();
                try {
                    String result = cache.computeIfAbsent(name, k -> task.get());
                    events.notify("TASK_COMPLETED", "Task " + name + " completed with result: " + result);
                } finally {
                    lock.unlock();
                }
            });
        }

        public void shutdown() {
            executor.shutdown();
        }
    }

    // --- Example Observer Implementation ---
    static class ConsoleLogger implements Observer {
        @Override
        public void update(String event, Object data) {
            System.out.println("[EVENT: " + event + "] " + data);
        }
    }

    // --- JSON Parsing Simulation ---
    static Map<String, Object> parseJson(String json) {
        return Arrays.stream(json.replace("{", "")
                .replace("}", "")
                .split(","))
                .map(s -> s.split(":"))
                .collect(Collectors.toMap(
                        arr -> arr[0].trim().replace("\"", ""),
                        arr -> arr[1].trim().replace("\"", "")
                ));
    }

    // --- MAIN ---
    public static void main(String[] args) throws InterruptedException {
        Database db = Database.getInstance();
        TaskProcessor processor = new TaskProcessor();

        // Add Observer
        processor.addObserver("TASK_COMPLETED", new ConsoleLogger());

        // Simulate tasks
        processor.submitTask("FetchUserData", () -> {
            simulateDelay();
            db.put("user", "Afraabi");
            return "User data saved: " + db.get("user");
        });

        processor.submitTask("ComputeStats", () -> {
            simulateDelay();
            return "Stats: " + new Random().nextInt(1000);
        });

        processor.submitTask("ParseJSON", () -> {
            simulateDelay();
            Map<String, Object> map = parseJson("{\"name\":\"AI System\", \"status\":\"active\"}");
            return map.toString();
        });

        processor.submitTask("CacheTest", () -> {
            simulateDelay();
            return "Cached Value XYZ";
        });

        processor.submitTask("CacheOverflow", () -> {
            simulateDelay();
            return "Cache overflow simulation";
        });

        // Allow threads to complete
        Thread.sleep(3000);
        processor.shutdown();

        System.out.println("\nFinal DB State: " + db.get("user"));
        System.out.println("LRU Cache Demonstration completed ✅");
    }

    private static void simulateDelay() {
        try { Thread.sleep(500 + new Random().nextInt(1000)); } 
        catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}

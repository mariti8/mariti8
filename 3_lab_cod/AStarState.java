/**
 * This class stores the basic state necessary for the A* algorithm to compute a
 * path across a map.  This state includes a collection of "open waypoints" and
 * another collection of "closed waypoints."  In addition, this class provides
 * the basic operations that the A* pathfinding algorithm needs to perform its
 * processing.
 **/
public class AStarState
{
    /** This is a reference to the map that the A* algorithm is navigating. **/
    private Map2D map;
    


    /**
     * Initialize a new state object for the A* pathfinding algorithm to use.
     **/
    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");

        this.map = map;
    }

    /** Returns the map that the A* pathfinder is navigating. **/
    public Map2D getMap()
    {
        return map;
    }

    /**
     * This method scans through all open waypoints, and returns the waypoint
     * with the minimum total cost.  If there are no open waypoints, this method
     * returns <code>null</code>.
     **/
    public Waypoint getMinOpenWaypoint()
    {
        //Эта функция должна проверить все точки в наборе открытых точек и
//вернуть ссылку на точку с наименьшей общей стоимостью. Если нет точки
//в "открытых" наборах, вернитесь NULL.
        // TODO:  Implement.
        
        float min = Float.POSITIVE_INFINITY;
        
        for (Waypoint wp: openWaypoints.values()) {
        	float cost = wp.getTotalCost();
        	if (cost < min) {
        		min = cost;
        		minWp = wp;
        	}
        }
        
        
        return null;
    }

    /**
     * This method adds a waypoint to (or potentially updates a waypoint already
     * in) the "open waypoints" collection.  If there is not already an open
     * waypoint at the new waypoint's location then the new waypoint is simply
     * added to the collection.  However, if there is already a waypoint at the
     * new waypoint's location, the new waypoint replaces the old one <em>only
     * if</em> the new waypoint's "previous cost" value is less than the current
     * waypoint's "previous cost" value.
     **/
    /**Это самый сложный способ в А* форме. А делает его сложнее, чем
остальные то, что он должен только добавить указанную точку при
существующей путевой точке. Вот то, что этот метод должен делать:
• Если в настоящее время нет точек для этого места в "открытых точках"
набора, то просто добавить новую точку.
• Если точка уже в этом месте в "открытой точке" набора, то потом
добавить новый пункт, только если "старая цена" за новую точку
меньше "старой цены" за текущую точку. (Убедитесь, что используете
прежнюю стоимость, а не общую стоимость.) Другими словами, если
новая точка представляет собой более короткий путь к этому месту, чем
текущий маршрут, заменить текущую точку на новую. **/
    
    public boolean addOpenWaypoint(Waypoint newWP)
    {
        // TODO:  Implement.
        Waypoint openWP = openWaypoints.get(newWP.loc);
        
        if (openWP == null || newWP.getPreviousCost() < openWP.getPreviousCost()) {
        	openWaypoints.put(newWP.loc, newWP);
        	
        	return true;
        }
        return false;
    }


    /** Returns the current number of open waypoints. **/
    public int numOpenWaypoints()
    {
        //Этот метод просто возвращает количество точек в набор открытых точек.
        // TODO:  Implement.
        if (openWaypoints.size())
        	return 1;
     
        return 0;
    }


    /**
     * This method moves the waypoint at the specified location from the
     * open list to the closed list.
     **/
    public void closeWaypoint(Location loc)
    {
        // TODO:  Implement.
        Waypoint openWP = openWaypoints.remove(loc);
        
        if (openWP != null) 
        {
        	closeWaypoints.put(loc, openWP);
        }
    }

    /**
     * Returns true if the collection of closed waypoints contains a waypoint
     * for the specified location.
     **/
    public boolean isLocationClosed(Location loc)
    {
        // TODO:  Implement.
        return closeWaypoints.containsKey(loc);
        //return false;
    }
}

/*
 * Copyright (C) 2009-2022 Lightbend Inc. <https://www.lightbend.com>
 */

package docs.http.javadsl.server.testkit;
//#source-quote
import org.apache.pekko.http.javadsl.server.AllDirectives;
import org.apache.pekko.http.javadsl.server.Route;

public class MyAppFragment extends AllDirectives {

    public Route createRoute() {
        return
                //#fragment
                pathEnd(() ->
                        get(() ->
                                complete("Fragments of imagination")
                        )
                );
                //#fragment
    }

}
//#source-quote

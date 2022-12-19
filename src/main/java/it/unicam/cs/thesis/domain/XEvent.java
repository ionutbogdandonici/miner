package it.unicam.cs.thesis.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * An event represents atomic granules of activity that have been observed during the execution of a process.
 * As such event has no duration. examples of an event are:
 * <ul>
 *     <li>Recording the client's personal information in the database has been completed</li>
 *     <li>One picture is taken by the x-ray machine</li>
 *     <li>An image has been downloaded by the web browser</li>
 * </ul>
 */
@Data
@Component
public class XEvent {

    /**
     * Attributes may have different types:
     * <ul>
     *     <li><code>String</code></li>
     *     <li><code>Date</code></li>
     *     <li><code>Integer</code></li>
     *     <li><code>Float</code></li>
     *     <li><code>Boolean</code></li>
     *     <li><code>ID</code></li>
     *     <li><code>List</code></li>
     *     <li><code>Container</code></li>
     * </ul>
     */
    Map<String, String> attributes;
}

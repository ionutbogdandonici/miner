package it.unicam.cs.thesis.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * A Trace describes the execution of one specific instance, or case, of the logged process.
 * Examples of traces are:
 * <ul>
 *     <li>One specific insurance claim</li>
 *     <li>One examination in which the x-ray machine is employed</li>
 *     <li>One visit of the website, by one specific user</li>
 * </ul>
 *
 * No XML attributes are defined for the <code><trace></trace></code> tag.
 *
 * Every trace contains an arbitrary number (may be empty) of event objects.
 */
@Data
@Component
public class XTrace {

    private List<XEvent> events;
}

package org.sirix.node.interfaces.immutable;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.sirix.api.visitor.VisitResult;
import org.sirix.api.visitor.Visitor;
import org.sirix.node.SirixDeweyID;
import org.sirix.node.interfaces.Node;
import org.sirix.node.interfaces.NodeBase;

import com.google.common.base.Optional;

/**
 * An immutable node.
 * 
 * @author Johannes Lichtenberger
 *
 */
public interface ImmutableNode extends NodeBase {
	/**
	 * Get the optional dewey ID
	 * 
	 * @return dewey ID
	 */
	Optional<SirixDeweyID> getDeweyID();

	/**
	 * Gets value type of the item.
	 * 
	 * @return value type
	 */
	int getTypeKey();
	
	/**
	 * Determines if {@code pOther} is the same item.
	 * 
	 * @param other
	 *          the other node
	 * @return {@code true}, if it is the same item, {@code false} otherwise
	 */
	boolean isSameItem(@Nullable Node other);

	/**
	 * Accept a visitor and use double dispatching to invoke the visitor method.
	 * 
	 * @param visitor
	 *          implementation of the {@link Visitor} interface
	 * @return the result of a visit
	 */
	VisitResult acceptVisitor(@Nonnull Visitor visitor);
	
	/**
	 * Getting the persistent stored hash.
	 * 
	 * @return the hash of this node
	 */
	long getHash();

	/**
	 * Gets key of the context item's parent.
	 * 
	 * @return parent key
	 */
	long getParentKey();

	/**
	 * Declares, whether the item has a parent.
	 * 
	 * @return {@code true}, if item has a parent, {@code false} otherwise
	 */
	boolean hasParent();
}

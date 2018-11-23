/**
 *  Copyright (c) 2018 Angelo ZERR.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *  Angelo Zerr <angelo.zerr@gmail.com> - initial API and implementation
 */
package org.eclipse.lsp4xml.dom;

/**
 * A Comment node.
 *
 */
public class DOMComment extends DOMCharacterData implements org.w3c.dom.Comment {

	boolean commentSameLineEndTag;

	int startContent;

	int endContent;

	public DOMComment(int start, int end, DOMDocument ownerDocument) {
		super(start, end, ownerDocument);
	}

	public boolean isCommentSameLineEndTag() {
		return commentSameLineEndTag;
	}

	@Override
	public int getStartContent() {
		return startContent;
	}

	@Override
	public int getEndContent() {
		return endContent;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.w3c.dom.Node#getNodeType()
	 */
	@Override
	public short getNodeType() {
		return DOMNode.COMMENT_NODE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.w3c.dom.Node#getNodeName()
	 */
	@Override
	public String getNodeName() {
		return "#comment";
	}
}
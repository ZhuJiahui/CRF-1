package org.postagging.crf.features;

/**
 * 
 * @author Asher Stern
 * Date: Nov 11, 2014
 *
 * @param <K>
 * @param <G>
 */
public class TokenAndTagFilter<K,G> extends Filter<K, G>
{
	public TokenAndTagFilter(K token, G currentTag, G previousTag)
	{
		super(token, currentTag, previousTag);
		this.token = token;
		this.currentTag = currentTag;
	}
	
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((currentTag == null) ? 0 : currentTag.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TokenAndTagFilter<?,?> other = (TokenAndTagFilter<?,?>) obj;
		if (currentTag == null)
		{
			if (other.currentTag != null)
				return false;
		} else if (!currentTag.equals(other.currentTag))
			return false;
		if (token == null)
		{
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		return true;
	}



	private final K token;
	private final G currentTag;
}

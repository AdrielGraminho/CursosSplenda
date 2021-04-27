import { useEffect, useState } from "react"

export const useFetch = (url, method = 'get') => {
    const [response, setResponse] = useState({
        data: null,
        loadding: true
    })

    useEffect(function() {
        fetch(url, { method })
            .then(resp => resp.json())
            .then(json => setResponse({
                data: json,
                loadding: false
            }))
    }, [url, method])

    return response
}